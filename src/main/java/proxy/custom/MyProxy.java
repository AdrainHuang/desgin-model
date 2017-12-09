package proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by AdrainHuang on 2017/12/4.
 * 生成代理
 */
@SuppressWarnings("ALL")
public class MyProxy {
	private static String ln = "\r\n";

	public static Object newProxyInstance(MyClassLoader loader, Class<?>[] interfaces, MyInvocationHandler h) {
		try {
			//1生成源代码
			String proxySrc = generateSrc(interfaces[0]);
			//2将生成的源代码输出到磁盘，保存为.class文件
			String filePath = MyProxy.class.getResource("").getPath();
			System.out.println(filePath);
			File f = new File(filePath + "$Proxy1.java");
			FileWriter fw = new FileWriter(f);
			fw.write(proxySrc);
			fw.close();
			//3编译源码，并且生成.class文件
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
			Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(f);
			JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
			task.call();
			manager.close();
			//4将class文件中内容，动态加载到jvm文件中来
			//5返回代理后的代理对象
			Class<?> $Proxy1 = loader.findClass("$Proxy1");
			Constructor<?> constructor = $Proxy1.getConstructor(MyInvocationHandler.class);
			f.delete();
			return constructor.newInstance(h);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private static String generateSrc(Class interfaces) {
		StringBuffer src = new StringBuffer();
		src.append("package proxy.custom;" + ln);
		src.append("import java.lang.reflect.Method;" + ln);
		src.append("public class $Proxy1 implements " + interfaces.getName() + "{" + ln);
		src.append("MyInvocationHandler h;" + ln);
		src.append("public $Proxy1(MyInvocationHandler h) {" + ln);
		src.append("this.h=h;" + ln);
		src.append("}" + ln);
		for (Method m : interfaces.getMethods()) {
			src.append("public " + m.getReturnType().getName() + " " + m.getName() + "(){" + ln);
			src.append("try {" + ln);
			src.append("Method m =" + interfaces.getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
			src.append("this.h.invoke(this,m,null);" + ln);
			src.append("} catch (Throwable e) {e.printStackTrace();" + ln);
			src.append("}" + ln);
			src.append("}" + ln);
		}
		src.append("}");
		return src.toString();
	}
}

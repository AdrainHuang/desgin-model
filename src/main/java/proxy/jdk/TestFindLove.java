package proxy.jdk;

import proxy.custom.MyMeiPo;

/**
 * Created by AdrainHuang on 2017/12/3.
 */
public class TestFindLove {
	public static void main(String[] args) throws Exception {
		try {
//			Person obj = (Person) new Meipo().getInstance(new XiaoXingxing());
//			System.out.println(obj.getClass().getName());
//			obj.findLove();


//			1. 拿到被代理对象的引用，然后获取它的接口
//			2. JDK代理重新生成一个类，同时实现我们给的代理对象所实现的接口
//			3. 把被代理对象用的引用也拿到了
//			4. 重新动态生成一个class字节码
//			5. 然后编译

			//获取字节码内容
//			byte[] data = ProxyGenerator.generateProxyClass("$proxy0",new Class[]{Person.class});
//			FileOutputStream os = new FileOutputStream("/Users/AdrainHuang/Documents/workspace/desginmodel/src/main/java/proxy/jdk/$proxy.class");
//			os.write(data);
//			os.close();
			Person obj = (Person) new MyMeiPo().getInstance(new XiaoXingxing());
			System.out.println(obj.getClass().getName());
			obj.findLove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

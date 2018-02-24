package visitorModel.demo1;

/**
 * Created by AdrainHuang on 2017/3/2.
 */
public interface Visitor {
	int visit(Book book);
	int visit(Fruits fruits);
}

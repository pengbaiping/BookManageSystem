package common;
import java.io.IOException;
import javax.servlet.*;
public class EncodingFilter implements Filter{
	public EncodingFilter(){
	}
	public void init(FilterConfig fConfig)
	throws ServletException{
	}
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
	throws IOException,ServletException{
		request.setCharacterEncoding("utf-8");
		chain.doFilter(request,response);
	}
	public void destroy(){
	}
}
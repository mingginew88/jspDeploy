package kr.or.ddit.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LocaleFilter
 */
@WebFilter("/localeSelectServlet")
public class LocaleFilter implements Filter {

    public LocaleFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		LocaleWrapper localeWrapper = new LocaleWrapper(req);
		
		chain.doFilter(localeWrapper, response);
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
	}

}

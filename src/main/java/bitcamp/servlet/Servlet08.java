/* 주제: 클라이언트가 보낸 데이터 꺼내기 II 
 * 같은 이름으로 여러 개의 데이터를 보낼 수 있다. 
 * 변수명의 중복적인 이용 가능하다는 의미인 듯하다. 
 * 
 */

package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet08")
public class Servlet08 extends GenericServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8"); 
    PrintWriter out = response.getWriter(); 
    
    String value = request.getParameter("name");
    out.println(value); 
    out.println("--------------");
    
    String[] values = request.getParameterValues("name"); 
    for (String item : values) {
      out.println(item); 
    }
    
  }
}

/* 주제: 클라이언트가 보낸 데이터 꺼내기 III 
 * 클라이언트가 어떤 이름으로 보낼지 알 수 없는 경우, 이름을 먼저 알아내고 출력한다. 
 * 
 */

package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet09")
public class Servlet09 extends GenericServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8"); 
    PrintWriter out = response.getWriter(); 
    
    Enumeration<String> names = request.getParameterNames();
    while (names.hasMoreElements()) {
     String name = names.nextElement(); 
     out.printf("%s=%s\n", name, request.getParameter(name)); 
    }
    
  }
}

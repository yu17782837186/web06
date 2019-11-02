package cn.com.ning;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MajorServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求编码格式
        request.setCharacterEncoding("utf-8");
        //设置响应编码格式
        response.setContentType("text/html;charset=utf-8");
        //获取请求信息
        //处理请求信息
        //响应处理结果
        response.getWriter().write("<html>");
        response.getWriter().write("<head>");
        response.getWriter().write("</head>");
        response.getWriter().write("<body>");
        response.getWriter().write("<h3>欢迎"+request.getParameter("uname")+"访问主页面</h3>");
        response.getWriter().write("<hr>");
        response.getWriter().write("</body>");
        response.getWriter().write("</html>");
    }
}

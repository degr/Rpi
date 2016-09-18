package rpi;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Rpi extends HttpServlet {

    static private String lastIp = "";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String save = req.getParameter("save");
        if(save != null) {
            lastIp = req.getRemoteHost();
        }
        resp.getWriter().println(lastIp);
    }
}

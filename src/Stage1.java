import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Stage1 extends HttpServlet {


    private String message;

    public void init() throws ServletException {
        // Do required initialization
        message = "This is the first page";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
        out.println("<a href=\"/stage2\">Stage 2</a>");
    }

    public void destroy() {
        // do nothing.
    }
}
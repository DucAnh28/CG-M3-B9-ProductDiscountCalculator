import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator", value = "/calculator")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        float listprice = Float.parseFloat(req.getParameter("ListPrice"));
        float discount = Float.parseFloat(req.getParameter("DiscountPercent"));

        float discountAmount = (float) (listprice * discount * 0.01);
        float discountPrice = (listprice - discountAmount);

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h2>Discount Amount: " + discountAmount + "</h2>");
        writer.println("<h2>Discount Price: " + discountPrice + "</h2>");
        writer.println("</html>");
    }
}

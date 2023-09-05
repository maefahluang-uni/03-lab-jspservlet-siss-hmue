package th.mfu;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//TODO: add webservlet to "/calbmi"
@WebServlet(urlPatterns = "/calbmi")
public class BMICalculatorServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO: get parameter from request: "weight" and "height"
        String weightinStr = request.getParameter("weight");
        String heightinStr = request.getParameter("height");
        response.setContentType("text/html");
        //TODO: calculate bmi
        double weight = Double.parseDouble(weightinStr);
        double height = Double.parseDouble(heightinStr);
        double result = weight/(height*height);
        result = Math.round(result);
        //TODO: determine the built from BMI
        
      
        //TODO: add bmi and built to the request's attribute

        //TODO: forward to jsp
           
    }
    
}

package myPackage;

import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet
 */

public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//createing string array to store jokes.
	
	 String[] jokes= {
			"डॉक्टर: तुम्हें क्या तकलीफ है? मरीज: डॉक्टर साहब, जब मैं बात करता हूँ तो मुझे लोग सुनते नहीं। डॉक्टर: अगला मरीज अंदर भेजो।",
			"प्रोग्रामर: मुझे एक नई गर्लफ्रेंड चाहिए। कंप्यूटर: एरर 404: गर्लफ्रेंड नॉट फाउंड।",
			"प्रोग्रामर: मुझे एक नई गर्लफ्रेंड चाहिए। कंप्यूटर: एरर 404: गर्लफ्रेंड नॉट फाउंड।",
			"प्रोग्रामर: तुमने मेरा दिल तोड़ दिया। कंप्यूटर: एरर: हार्ड ड्राइव नॉट डिटेक्टेड।",
			"प्रोग्रामर: मैं थक गया हूँ। कंप्यूटर: क्या मैं तुम्हें रीस्टार्ट कर दूं?",
			"प्रोग्रामर: मुझे समझ नहीं आ रहा। कंप्यूटर: क्या मैं तुम्हें डिबग कर दूं?"
	};
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//calling value from index.html
		String number1=request.getParameter("firstNumber");
		String number2=request.getParameter("secondNumber");
		String operator=request.getParameter("btn1");
		
		//type casting
		int num1=Integer.parseInt(number1);
		int num2=Integer.parseInt(number2);
		
		//performing operation on both number
		int sum=0;
			switch (operator) {
			case "1":
				 sum=num1+num2;
				break;
			case "2":
				 sum=num1-num2;
				break;
			case "3":
				 sum=num1*num2;
				break;
			case "4":
				 sum=num1/num2;
				break;
			}
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(operator);
			System.out.println(sum);
//			System.out.println(randomIndex);
			//response.getWriter().append("Ans = "+sum);
			
			int randomIndex=(int) (Math.random() * jokes.length);
			String randomJoke=jokes[randomIndex];
			//redirect or sending the data/ answer to jsp page by using response with key value pair
			String encodedJoke = URLEncoder.encode(randomJoke, "UTF-8");
			response.sendRedirect("NewFile.jsp?ans=" + sum + "&Joke=" + encodedJoke);
		
		
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

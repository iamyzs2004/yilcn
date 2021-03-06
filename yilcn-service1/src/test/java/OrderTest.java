import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.yilcn.service1.Service1Application;

@RunWith(SpringRunner.class) 
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = Service1Application.class)
@AutoConfigureMockMvc
public class OrderTest {

	 @Autowired 
	 private MockMvc mockMvc; 
	 
	@Test
	public void testCreateOrder() {
		String paramJson ="";
		 MvcResult mvcResult;
		try {
			mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/order/create").contentType(MediaType.APPLICATION_JSON).content(paramJson)).andReturn();
		    System.out.println(mvcResult.getResponse().getContentAsString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

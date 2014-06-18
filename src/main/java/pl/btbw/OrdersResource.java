package pl.btbw;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("orders")
public class OrdersResource {

	@GET
	@Path("/exception")
	@Produces(MediaType.APPLICATION_JSON)
	public Order exceptionTest() {
		throw new  RuntimeException("Lorem Ipsum Exception");
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Order> getOrders() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order("0001", "Item 1"));
		orders.add(new Order("0002", "Item 2"));
		orders.add(new Order("0003", "Item 3"));
		return orders;
	}

	@GET
	@Path("{number}")
	@Produces(MediaType.APPLICATION_JSON)
	public Order getOrder(@PathParam("number") String number) {
		return new Order(number, "Lorem");
	}
}

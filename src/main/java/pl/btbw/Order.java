package pl.btbw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Order {

	public String number;
	public String name;

	public Order() {
	}

	public Order(String number, String name) {
		this.number = number;
		this.name = name;
	}
}

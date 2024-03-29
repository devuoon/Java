package com.abst;

class Coffee {
    int price;
    
    Coffee(int price) {
        this.price = price;
    }
}

class Customer {
    int money = 300000;

    void buyCoffee(Coffee coffee) {
        if (money < coffee.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= coffee.price;
        System.out.printf("%s를 구입하였습니다. 잔액 %s원 남았습니다. \n", coffee, money);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.buyCoffee(new Americano());    //5000
        c.buyCoffee(new Hazelnet());    //5500
        c.buyCoffee(new Cafelatte());    //7500
        c.buyCoffee(new Cafemoka());    //7000

        System.out.printf("커피를 구입하고 남은 잔액은 %d 입니다.\n", c.money);
    }
}

class Americano extends Coffee {
	 Americano() {
	        super(5000);
	 }

	@Override
	public String toString() {
		return "아메리카노";
	}
}

class Hazelnet extends Coffee {
	Hazelnet() {
	        super(5500);
	}
	@Override
	public String toString() {
		return "헤이즐넛";
	}
}

class Cafelatte extends Coffee {
	Cafelatte() {
        super(7500);
    }
	@Override
	public String toString() {
		return "카페라떼";
	}
}

class Cafemoka extends Coffee {
	Cafemoka() {
        super(7000);
    }
	@Override
	public String toString() {
		return "카페모카";
	}
}

package com.afroz;

import java.rmi.RemoteException;
import java.util.Scanner;
import com.afroz.FirstWebServiceStub.AddTwoNumber;
import com.afroz.FirstWebServiceStub.AddTwoNumberResponse;

public class TestClient {

	public static void main(String[] args) throws RemoteException  {
		FirstWebServiceStub stub= new FirstWebServiceStub();
		AddTwoNumber atn = new AddTwoNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter b number: ");
		int b=sc.nextInt();
		atn.setFirstNumber(a);
		atn.setSecondNumber(b);
		AddTwoNumberResponse res = stub.addTwoNumber(atn);
		System.out.println("Addition of a and b is "+res.get_return());

	}

}

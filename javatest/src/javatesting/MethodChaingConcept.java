package javatesting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodChaingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("man","ban","ora","kela");
		
//		Stream<String> nameStream= names.stream();
//		Stream<String> nameMapStream= nameStream.map(e->e +"fruit");
		List<String> newNmae =names.stream().map(e->e +"fruit").collect(Collectors.toList()) ;
		
		
		System.out.println(newNmae);

	}

}

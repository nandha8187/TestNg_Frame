package testNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Transformer_Class implements IAnnotationTransformer{
	
	
	@Override
	public void transform(ITestAnnotation annotation,
			Class testClass, Constructor testConstructor, Method testMethod,Class<?> occurringClazz) {
	
	
		 //@Test(retryAnalyser = Retry_Class.class)
		
		
		annotation.setRetryAnalyzer(Retry_Class.class);
		
		
		 
	
	
	}
	
	
	      
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package tcc.iff.rdf.rest.service;

import java.util.List;

import org.apache.jena.rdf.model.Statement;

import tcc.iff.rdf.rest.tdb.TDBConnection;

public class ProdutoService {
	
	//TDBConnection tdb = null;
	
	String URI = "https://tutorial-academy.com/2015/tdb#";
	
	String namedModel1 = "Model_German_Cars";
	String namedModel2 = "Model_US_Cars";
	
	String john = URI + "John";
	String mike = URI + "Mike";
	String bill = URI + "Bill";
	String owns = URI + "owns";
	
	TDBConnection tdb = new TDBConnection("tdb");
	
	
	public Object addProduto(String modelName, String subject, String property, String object) {
		tdb.addStatement(modelName, subject, property, object);
		tdb.closeDS();
		return null;
	}
	
}

	


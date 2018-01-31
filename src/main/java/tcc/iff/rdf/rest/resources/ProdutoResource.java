package tcc.iff.rdf.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tcc.iff.rdf.rest.tdb.TDBConnection;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResource {
	/*
	String URI = "https://tutorial-academy.com/2015/tdb#";
	
	String namedModel1 = "Model_German_Cars";
	String namedModel2 = "Model_US_Cars";
	
	String john = URI + "John";
	String mike = URI + "Mike";
	String bill = URI + "Bill";
	String owns = URI + "owns";
	
	TDBConnection tdb = new TDBConnection("tdb");
	
	
	

	
	
	@POST
	@Path("/{modelName}/{subject}/{property}/{object}")
	public String addProduto(@PathParam("modelName") String modelName, 
							 @PathParam("subject") String subject,
							 @PathParam("property") String property, 
							 @PathParam("object") String object) {
		tdb.addStatement(modelName, subject, property, object);
		tdb.closeDS();
		return null;
	}
	*/
	
	@POST
	@Path("/{modelName}/{subject}/{property}/{object}")
	public Object addProd( @PathParam("modelName") String m, 
					  	   @PathParam("subject") String s,
						   @PathParam("property") String p, 
						   @PathParam("object") String o) {
		TDBConnection tdb = new TDBConnection("tdb");
		tdb.addStatement(m, s, p, o);
		return "adicionado com sucesso";
	}
	
	@GET
	@Path("/{modelName}/{subject}/{property}/{object}")
	public Object Teste() {
		return "teste ok";
	}
	
	@GET
	@Path("/{ProdutoID}")
	public String teste2(@PathParam("CategoriaID") long categoriaID, @PathParam("ProdutoID") long produtoID) {
		return "O ID da categoria é: "+ categoriaID + "\n O ID do produto é: " + produtoID;
	}
	
}

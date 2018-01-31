package tcc.iff.rdf.rest.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import tcc.iff.rdf.rest.model.Categoria;
import tcc.iff.rdf.rest.service.CategoriaService;
import tcc.iff.rdf.rest.tdb.TDBConnection;

@Path("/categorias")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CategoriaResource {

	
	CategoriaService categoriaService = new CategoriaService();
	
	@GET
	public List<Categoria> getCategorias(){
	return categoriaService.getAllCategorias();
	}
	
	/*
	@GET
	public List<Categoria> getCategorias(@QueryParam("start") int start,
										 @QueryParam("size") int size) {
		
		if(start >= 0 || size >= 0) {
			return categoriaService.getAllCategoriasPaginated(start, size);
		}
	return categoriaService.getAllCategorias();
	}
	
	
	@POST
	public Response addCategoria(Categoria cat, @Context UriInfo uriInfo) {
		Categoria newCat = categoriaService.addCategoria(cat);
		String newID = String.valueOf(newCat.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newID).build();
		return Response.created(uri)
				.entity(newCat)
				.build();
	}
	*/
	

	@PUT
	@Path("/{CategoriaID}")
	public Categoria updateCategoria(@PathParam("CategoriaID") long id, Categoria cat) {
		cat.setId(id);
		return categoriaService.updateCategoria(id,cat);
	}
	
	@DELETE
	@Path("/{CategoriaID}")
	public void deleteCategoria(@PathParam("CategoriaID") long id) {
		categoriaService.deleteCategoria(id);
	}
	
	@Path("/{CategoriaID}/produtos")
	public ProdutoResource getProdutoResource() {
		return new ProdutoResource();
	}
	
}

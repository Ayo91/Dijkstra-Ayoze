package es.VogellaImplementation.Dijkstra;

/*
 * Esta clase representa las aristas. Tienen varios atributos como un identificador, nodo de origen, nodo 
 * destino y un peso asociado que nos va a ayudar a determinar los nodos y aristas mas bondadosos.
 */
public class Edge  {
	  private final String id; 
	  private final Vertex source;
	  private final Vertex destination;
	  private final int weight; 
	  
	  public Edge(String id, Vertex source, Vertex destination, int weight) {
	    this.id = id;
	    this.source = source;
	    this.destination = destination;
	    this.weight = weight;
	  }
	  
	  public String getId() {
	    return id;
	  }
	  public Vertex getDestination() {
	    return destination;
	  }

	  public Vertex getSource() {
	    return source;
	  }
	  public int getWeight() {
	    return weight;
	  }
	  
	  @Override
	  public String toString() {
	    return source + " " + destination;
	  }	  
} 

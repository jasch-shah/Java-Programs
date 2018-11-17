import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayDeque;

public class Solution {
	private static final int EDGE_WEIGHT = 6;

	 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	int numQueries = sc.nextInt();

	 	for (int q = 0;q < numQueries ;q++ ) {
	 		int numNodes = sc.nextInt();
	 		int numEdges = sc.nextInt();

	 		/* Create Nodes*/

	 		Node[] node = new Node[numNodes + 1]; //node i will be at index i
	 		node[0] = null;
	 		for (int i = 1;i <= numNodes ;i++ ) {

	 			node[i] = new Node(i);
	 			
	 		}

	 		//connect nodes

	 		for(int i = 0;i < numEdges; i++){
	 			int n1 = sc.nextInt();
	 			int n2 = sc.nextInt();
	 			node[n1].addNeighbour(node[n2]);
	 		}

	 		// create MST
	 		int start = sc.nextInt();
	 		findDistances(node[start]);

	 		// print results

	 		for(int i = 1; i <= numNodes; i++){
	 			if(i != start){
	 				System.out.print(node[i].distance + " ");
	 			}
	 		}
	 		System.out.println();
	 		
	 	}

	 	sc.close();
		
	}

	/*
		uses BFS to find minimum distance of each Node from start .
		Can use BFS instead of Dijistra's Algorithm since edges are equally weighted

	*/

		private static void findDistances(Node start){
			if(start == null){
				return;
			}
			ArrayDeque<Node> deque = new ArrayDeque<>(); //use deque as queue
			start.distance = 0;
			deque.add(start);
			while(!deque.isEmpty()) {
				Node curr = deque.remove();
				for(Node neighbour : curr.neighbours){
					if(neighbour.distance == -1){	//this mean's this node is unvisited

						neighbour.distance = curr.distance + EDGE_WEIGHT;
						deque.add(neighbour);

					}
				}
			}
		}

		// Implementation of an UNDIRECTED graph
		public static class Node {
			public final int id;	//each node will have unique id
			public int distance; // also tells if node has been visited (-1 mean's unvisited)
			public HashSet<Node> neighbours;

			public Node(int id){
				this.id = id;
				distance = -1;
				neighbours = new HashSet<>();
			}

			public void addNeighbour(Node neighbour){
				neighbours.add(neighbour);
				neighbour.neighbours.add(this);
			}
			@Override
			public boolean equals(Object other) {
				if(other == this){
					return true;
				} else if(other == null || !(other instanceof Node)){
					return false;
				}
				Node otherNode = (Node) other;
				return this.id == otherNode.id;
			}

			@Override
			public int hashCode(){
				return id;	//simple and effective
			}
		}
	}



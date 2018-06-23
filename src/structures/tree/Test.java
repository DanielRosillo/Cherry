package structures.tree;

import java.util.Optional;

/**
 * 
 * @author DanielRosillo
 * @github DanielRosillo
 */
public class Test
{

    public static void main(String[] args)
    {
	try
	{
	    Node origin = new Node("A", 0.0);
	    Tree tree = new Tree(origin, "N", " TEST");

	    Node B = new Node("B", 1.0);
	    Node C = new Node("C", 5.0);

	    Node D = new Node("D", 6.0);
	    Node E = new Node("E", 9.0);
	    Node F = new Node("F", 8.0);
	    Node G = new Node("G", 5.0);
	    Node H = new Node("H", 1.0);

	    Node I = new Node("I", 5.0);
	    Node J = new Node("J", 6.0);
	    Node K = new Node("K", 8.0);
	    Node L = new Node("L", 7.0);
	    Node M = new Node("M", 2.0);
	    Node N = new Node("N", 1.0);
	    Node O = new Node("O", 9.0);
	    Node P = new Node("P", 8.0);

	    tree.flourish(origin, B);
	    tree.flourish(origin, C);

	    tree.flourish(B, D);
	    tree.flourish(B, E);

	    tree.flourish(C, F);
	    tree.flourish(C, G);
	    tree.flourish(C, H);

	    tree.flourish(D, I);
	    tree.flourish(D, J);
	    tree.flourish(E, K);
	    tree.flourish(E, L);
	    tree.flourish(E, M);

	    tree.flourish(F, N);
	    tree.flourish(H, O);
	    tree.flourish(H, P);

	    System.out.println("\n Original tree");
	    tree.onList().forEach(n -> System.out.println(n.state));
	    System.out.println("--------------------------------------------------------");
	    System.out.println("Solution");
	    Optional<Node> r = tree.IDS(4);
	    tree.trip(r.get());
	}
	catch (Throwable m)
	{
	    m.printStackTrace();
	}

	System.exit(0);
    }
}

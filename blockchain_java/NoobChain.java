import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class NoobChain{


	public static ArrayList<Block> blockchain = new ArrayList<Block>();

	public static void main(String[] args) {


		
		Block genesisBlock = new Block("Hii,I am the first block","0");
		System.out.println("Hash for block 1: "+ genesisBlock.hash);


		Block secondBlock = new Block("Hii,I am the second block",genesisBlock.hash);
		System.out.println("Hash for block 2: "+ secondBlock.hash);


		Block thirdBlock = new Block("Hii,I am the third block",secondBlock.hash);
		System.out.println("Hash for block 3: "+ thirdBlock.hash);

		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		System.out.println(blockchainJson);



	}

	public static Boolean isChainValid(){
		Block currentBlock;
		Block previousBlock;

		//loop through blockchain

		for(int i = 0;i<blockchain.size();i++)
		{
			currentBlock = blockchain.get(i);
			previousBlock = blockchain.get(i-1);

			if(!currentBlock.hash.equals(currentBlock.calcula))
		}
	}
}
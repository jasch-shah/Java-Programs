
class RemovePunctuations
{
	public static void main(String[] args) {
		String str = "Welcome ???@@### $ to$#@ Geeks~%^for*^%#Geeks**";
		str=str.replaceAll("\\p{Punct}","");
		System.out.println(str);
	}
}
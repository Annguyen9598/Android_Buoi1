import java.lang.Exception
import java.lang.IllegalArgumentException

object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var count : Int = 0;
            if(leftStrand.length != rightStrand.length){
                throw IllegalArgumentException("left and right strands must be of equal length");
            }
            else{
                for(i in 0 until leftStrand.length ){
                    if(!leftStrand.substring(i,i+1).equals(rightStrand.substring(i,i+1))){
                        count++;
                    }
                }
                return count;
            }
    }
}

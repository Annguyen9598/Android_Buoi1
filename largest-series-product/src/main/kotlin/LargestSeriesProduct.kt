class Series (private val input: String){

    // TODO: Implement proper constructor
    init {
        require(input.contains("^[0-9]*$".toRegex()))
    }
    fun getLargestProduct(span: Int): Long {
        TODO("Implement this function to complete the task")
        when{
            span == 0 -> 1
            span >input.length -> throw IllegalArgumentException();
            else -> input.windowed(span){
                it.fold(1){product,digitalchar -> product*(digitalchar - '0')}
            }.max()
        }
    }
}

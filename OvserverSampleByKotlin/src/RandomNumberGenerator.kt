class RandomNumberGenerator : NumberGenerator() {

    override fun execute() {
        for (i in 0..19) {
            number = (0..49).random()
            notifyObservers()
        }
    }

}
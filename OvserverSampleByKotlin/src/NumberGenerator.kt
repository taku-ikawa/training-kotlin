abstract class NumberGenerator {
    private val observers = mutableListOf<Observer>()
    var number = 0

    fun addObserver(observer: Observer) {    // Observerを追加
        observers.add(observer)
    }

    fun deleteObserver(observer: Observer) { // Observerを削除
        observers.remove(observer)
    }

    fun notifyObservers() { // Observerへ通知
        for (observer in observers) {
            observer.update(this)
        }
    }

    abstract fun execute() // 数を生成する
}
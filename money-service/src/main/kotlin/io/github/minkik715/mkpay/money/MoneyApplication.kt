package io.github.minkik715.mkpay.money
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MoneyApplication


fun main(args: Array<String>){
    runApplication<MoneyApplication>(*args)
}
package spark.pokemonRDD

import org.apache.spark.{SparkConf, SparkContext}

object SimpleRDD {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local").setAppName("pokemon")
    val context = new SparkContext(conf)
    val pokemonData = context.textFile("..\\SparkLearn\\Pokemon.csv")

    println(pokemonData.count())

    val pokemons = pokemonData.map(f = line => {
      val stats: Array[String] = line.split(",")
      new Pokemon(stats(0), stats(1), stats(11), stats(2), stats(3),stats(12).toBoolean)
    })
    val atesPokemon = pokemons.filter(f => f.pokemonType1 == "Fire")
    //atesPokemon.foreach(f => println(f.pokemonName + "=>" + f.pokemonType1))
    val legendaryPokemon=pokemons.filter(f=>f.isLegendary)
    legendaryPokemon.foreach(f=>println(f.pokemonName))
    pokemons.foreach(f => println(f.pokemonID + " " + f.pokemonName + " " + f.pokemonType1 + " " + f.pokemonType2 + " " + f.pokemonGeneration)
    )
  }
}

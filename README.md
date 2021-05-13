# Potter books kata using Java and Spring

## Problem Description
Once upon a time there was a series of 5 books about a very English hero called Harry.
(At least when this Kata was invented, there were only 5. Since then they have multiplied)
Children all over the world thought he was fantastic, and, of course, so did the publisher.
So in a gesture of immense generosity to mankind, (and to increase sales) they set up the following
pricing model to take advantage of Harry’s magical powers.

One copy of any of the five books costs 8 EUR. If, however, you buy two different books from the series,
you get a 5% discount on those two books. If you buy 3 different books, you get a 10% discount.
With 4 different books, you get a 20% discount. If you go the whole hog, and buy all 5, you get a huge
25% discount.

Note that if you buy, say, four books, of which 3 are different titles, you get a 10% discount on the 3
that form part of a set, but the fourth book still costs 8 EUR.

Potter mania is sweeping the country and parents of teenagers everywhere are queueing up with shopping
baskets overflowing with Potter books. Your mission is to write a piece of code to calculate the price
of any conceivable shopping basket, giving as big a discount as possible.

For example, how much does this basket of books cost?

* 2 copies of the first book
* 2 copies of the second book
* 2 copies of the third book
* 1 copy of the fourth book
* 1 copy of the fifth book
answer :
```
(4 * 8) - 20% [first book, second book, third book, fourth book]
+ (4 * 8) - 20% [first book, second book, third book, fifth book]
  = 25.6 * 2
  = 51.20
```

## How to run this project
This is a java project using Java 11 and Spring boot 2.4.5.
For running the application, you need to download all dependencies :
```
$ mvn clean package
```

In order to start quickly, Swagger UI has been pre-configured and a REST operation is ready to be used.
You can navigate to [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to
see the result after running the command `mvn spring-boot:run`.

```shell
$ mvn clean package spring-boot:run
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building potter-kata 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[...]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.5)

INFO 36957 --- [  restartedMain] k.r.potter.PotterKataApplication         : Starting PotterKataApplication using Java 11.0.11 on XXX with PID 36957 (java-spring-potter-kata/target/classes started by XXX in /java-spring-potter-kata)
INFO 36957 --- [  restartedMain] k.r.potter.PotterKataApplication         : No active profile set, falling back to default profiles: default
INFO 36957 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
INFO 36957 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
INFO 36957 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
INFO 36957 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
INFO 36957 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.45]
INFO 36957 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
INFO 36957 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1637 ms
INFO 36957 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
INFO 36957 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
INFO 36957 --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
INFO 36957 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
INFO 36957 --- [  restartedMain] k.r.potter.PotterKataApplication         : Started PotterKataApplication in 3.505 seconds (JVM running for 4.017)
```

## Clues
You’ll find that this Kata is easy at the start. You can get going with tests for baskets of 0 books,
1 book, 2 identical books, 2 different books… and it is not too difficult to work in small steps and
gradually introduce complexity.

However, the twist becomes apparent when you sit down and work out how much you think the sample basket
above should cost. It isn’t `5 * 8 * 0.75 + 3 * 8 * 0.90`. It is in fact `4 * 8 * 0.8 + 4 * 8 * 0.8`.
So the trick with this Kata is not that the acceptance test you’ve been given is wrong.
The trick is that you have to write some code that is intelligent enough to notice that two sets of four
books is cheaper than a set of five and a set of three.

You will have to introduce a certain amount of clever optimization algorithm. But not too much!
This problem does not require a fully fledged general purpose optimizer. Try to solve just this
problem well in order to share it for everyone or even in the ??? . Trust that you can generalize
and improve your solution if and when new requirements come along.

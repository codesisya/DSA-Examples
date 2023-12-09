package org.sou.vertx;


import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Vertx vertx = Vertx.vertx();
    HttpServer server = vertx.createHttpServer();
    Router router = Router.router(vertx);
    router.route()
            .handler(routingContext -> {
              HttpServerResponse response= routingContext.response();
              response.putHeader("content-type","text/plain");
              response.end("hi bro");
            });
    server.requestHandler(router::accept)
            .listen(8091);
  }
}

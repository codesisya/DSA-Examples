package org.sou.completableFutures;

import java.util.concurrent.CompletableFuture;

public class FirstExample {
  public static CompletableFuture<Integer> create() {
    return CompletableFuture.supplyAsync(() -> 2);
  }

  public static void main(String[] args) throws Exception{
    CompletableFuture<Integer> future = create();
    final Integer data1;
    future.thenAccept(integer -> System.out.println(integer));
    create().get();
           /* .thenAccept(data -> data1 = data)
            .thenRun(() -> System.out.println("this never dies"))
            .thenRun(() -> System.out.println("it never ends"));*/

  }
}

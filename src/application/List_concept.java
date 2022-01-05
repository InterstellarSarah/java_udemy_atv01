package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List_concept {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Adolf");
        list.add("Joseph");
        list.add("Stalin");
        list.add("Hitler");
        list.add(2, "Marquinhos");

        System.out.println(list.size());
        System.out.println("--------------------------");

        for(String x : list){
            System.out.println(x);
        }
       // list.remove("Marquinhos");
       //  list.remove(2);
         list.removeIf(x -> x.charAt(0)=='M');
        System.out.println("--------------------------");
        for(String x : list){
            System.out.println(x); //mostra todo o conteudo
        }
         System.out.println(list.size()); //numera a lista

        System.out.println("--------------------------");
        System.out.println("Index of Stalin: " + list.indexOf("Stalin")); //mostra a posição de algo, se ele nao esta´disponivel, retorna como -1
        System.out.println("--------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // mostra o conteúdo definifo (ex aqui: apenas pessoas com inicial A)
        for(String x : result){
            System.out.println(x);
        }
        System.out.println("--------------------------");
        String  name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
        //se nao encontrar, retornará nulo pois nao há ninguém com esta inicial na lista
        System.out.println(name);
    }
}

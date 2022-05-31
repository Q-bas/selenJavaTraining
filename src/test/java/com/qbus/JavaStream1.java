package com.qbus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStream1 {
    @Test
    public void regular() {
        //count the number of names starting with alphabet A in a list
        //declare new ArrayList
        List<String> names = new ArrayList<String>();
        //populate ArrayList
        names.add("Axxx");
        names.add("Arn");
        names.add("Your");
        names.add("Dog");
        names.add("John");
        int count = 0;

        //iterate through list and find which name starts with "A" than increment counter if TRUE
        for (int i=0;i<names.size();i++){
            String name = names.get(i);
            if(name.startsWith("a")){
                count++;
            }
        }
        System.out.println(count);
    }
    @Test
    public void streamFilter(){
        List<String> names = new ArrayList<String>();
        names.add("Axxxq");
        names.add("Arn");
        names.add("Your");
        names.add("Dog");
        names.add("Johny");
        //count all names that starts with A
        Long c = names.stream().filter(s ->s.startsWith("A")).count(); 
        System.out.println(c);

        //print all the names from array where lettrcount > 4
        names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

        //print first name that >4\
        names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
        
    }
    @Test
    public void streamMap(){
        //print first name that finishes with Y with Uppercase
        Stream.of("aaa","johny","abbigail","adam", "robert","antony")
            .filter(s ->s.endsWith("y"))
            .map(s->s.toUpperCase())
            .forEach(s->System.out.println(s));
    }
    //print names started with A - uppercase and sorted
    @Test
    public void streamMap2(){
        List<String> xname = Arrays.asList("aaa","johny","abbigail","adam", "robert","antony");
        xname.stream()
            .filter(s -> s.startsWith("a"))
            .sorted()
            .map(s->s.toUpperCase())
            .forEach(s->System.out.println(s));

        List<String> names = new ArrayList<String>();
        //populate ArrayList
        names.add("Axxx");
        names.add("Arn");
        names.add("Your");
        names.add("Dog");
        names.add("John");

        //merging two list
        Stream<String> newNames = Stream.concat(names.stream(), xname.stream());
        //newNames.sorted().forEach(s -> System.out.println(s));

        boolean flag = newNames.anyMatch(s->s.equalsIgnoreCase("Axxx"));
        Assert.assertTrue(flag);
    }
    @Test
    public void streamCollect(){
        List<String> lst = Stream.of("aaa","johny","abbigail","adam", "robert","antony")
        .filter(s->s.endsWith("y"))
        .map(s->s.toUpperCase())
        .collect(Collectors.toList());
        System.out.println( lst.get(0));
    }

}


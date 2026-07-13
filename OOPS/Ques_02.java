/*

# TCS IPA OOP Coding Question 02 – Movie Management System

## Problem Statement

Create a class **Movie** with the following attributes:

* `movieName` (String)
* `company` (String)
* `genre` (String)
* `budget` (int)

The attributes should be **private**.

Write:

* A **parameterized constructor**
* **Getter methods**
* **Setter methods**

---

## Create a Class `Solution`

In the `Solution` class, implement the following static method:

### `getMovieByGenre(Movie[] movies, String searchGenre)`

### Description

This method takes:

* An array of `Movie` objects.
* A `String` representing the search genre.

The method should:

* Compare the movie genre with the given search genre (**case-insensitive**).
* Return an array containing only the matching `Movie` objects.
* If no matching movie is found, return `null`.

---

## Main Method Requirements

1. Read the details of **4 Movie objects** using the `Scanner` class.

2. Read an additional **String** representing the search genre.

3. Call the method:

```java
getMovieByGenre(Movie[] movies, String searchGenre)
```

4. If the returned array is **not null**, then for every movie in the returned array:

* If the movie budget is **greater than 80,000,000**, print:

```
High Budget Movie
```

* Otherwise, print:

```
Low Budget Movie
```

5. If the returned array is **null**, print:

```
No Movie Found
```

---

# Concepts Covered

* Class
* Object
* Encapsulation
* Constructor
* Getter
* Setter
* Array of Objects
* Scanner
* Static Method
* Enhanced for Loop
* Object Filtering
* Returning an Array of Objects
* Returning `null`
* String Comparison using `equalsIgnoreCase()`

---

# Expected Approach

### Step 1

Create the `Movie` class.

---

### Step 2

Declare all attributes as **private**.

---

### Step 3

Write a parameterized constructor.

---

### Step 4

Generate Getter and Setter methods.

---

### Step 5

Implement the static method:

```java
getMovieByGenre(Movie[] movies, String searchGenre)
```

Inside the method:

* Create a temporary `Movie[]` array.
* Traverse the original array.
* Compare genres using `equalsIgnoreCase()`.
* Store matching objects.
* Maintain a `count` variable.
* If `count == 0`, return `null`.
* Create a new array of size `count`.
* Copy matching objects.
* Return the final array.

---

### Step 6

Inside the `main()` method:

* Read input for 4 Movie objects.
* Read the search genre.
* Call the static method.
* If the returned array is `null`, print:

```
No Movie Found
```

* Otherwise, traverse the returned array and print:

```
High Budget Movie
```

or

```
Low Budget Movie
```

based on the budget.

---

# Learning Outcome

After solving this problem, you should be able to:

* Create classes and objects.
* Work with parameterized constructors.
* Implement encapsulation using getters and setters.
* Store objects in an array.
* Filter objects based on a condition.
* Return an array of objects.
* Handle `null` return values.
* Use enhanced `for` loops.
* Apply object-oriented programming concepts in TCS IPA-style coding questions.



*/
package OOPS;
import java.util.*;

class Movie
{
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    // Parameterized Constructor

    Movie(String movieName, String company, String genre, int budget)
    {
        this.movieName = movieName;
        this.company=company;
        this.genre=genre;
        this.budget=budget;
    }

    // Getter

    public String getMovieName()
    {
        return movieName;
    }

    public String getCompany()
    {
        return company;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getBudget()
    {
        return budget;
    }

    // Setter

    public void SetMovieName(String movieName)
    {
        this.movieName = movieName;
    }

    public void SetCompany(String company)
    {
        this.company=company;
    }
    public void setGenre(String genre)
    {
        this.budget=budget;
    }
}




public class Ques_02
{

    public static Movie[] getMovieByGenre(Movie[] movies,String genre)
    {
        Movie[] result = new Movie[movies.length];

        int count=0;

        for(Movie movie:movies)
        {
            if(movie.getGenre().equalsIgnoreCase(genre))
            {
                result[count]=movie;
                count++;

            }
        }
        if(count==0)
        {
            return null;
        }

        Movie[] res = new Movie[count];

        for(int i=0;i<count;i++)
        {
            res[i]=result[i];
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        Movie[] movies = new Movie[4];

        // Read Objects

        for(int i=0;i<movies.length;i++) {
            String movieName = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt();
            sc.nextLine();

            movies[i] = new Movie(movieName, company, genre, budget);
        }

        // For Question
        String searchGenre = sc.nextLine();
        Movie[] result = getMovieByGenre(movies, searchGenre);

        if(result==null)
        {
            System.out.println("No Movie Found");
        }

        else
        {
            for(Movie movie:result)
            {
                if(movie.getBudget()>80000000)
                {
                    System.out.println("High Budget Movie");
                }
                else
                {
                    System.out.println("Low Budget Movie");
                }
            }
        }
    }

}

<h3> Description</h3>
You are on a flight and wish to watch two movies during this flight. You are given an integer ArrayList containing the movies 
duration (in minutes) and the flight duration (minutes).

You need to find a pair of films with the longest duration which must not exceed the duration of the flight minus 30 
(to take takeoff and landing into account). If more than one pair is found which satisfies these conditions then return the 
pair containing the longest movie.

<h3>Data  Dictionary</h3>
<table border=1>
<tr><td>int flightDur</td><td> the total duration of the flight</td</tr>
<tr><td> ArrayList<Integer> movieDurations </td><td> an array containing the durations (in minutes) of all available films for the flight</td></tr></table>

<h3>Conditions</h3>
<table border=1>
<tr><td>Condition 1:</td><td>Maximum pair duration = flightDur-30</td></tr>
<tr><td>Condition 2:</td><td>Output must contain the pair with the longest duration</td></tr>
<tr><td>Condition 3:</td><td>If condition 2 is satisfied with more than one pair of movies then return pair with movie with longest duration</td></tr></table>

<h3> Test Case / Output </h3>
<table border=1>
<tr><td> Array of movie durations:</td><td> [90, 85, 75, 60, 120, 150, 125]</td></tr>
<tr><td>Flight duration:</td><td>250</td></tr>
<tr><td> Expected output</td><td>[90,125]</td></tr>
</table>

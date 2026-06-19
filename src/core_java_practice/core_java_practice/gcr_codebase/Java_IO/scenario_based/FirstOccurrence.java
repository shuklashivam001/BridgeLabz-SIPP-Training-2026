package core_java_practice.core_java_practice.gcr_codebase.Java_IO.scenario_based;

public class FirstOccurrence {
    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int index = haystack.indexOf(needle);

        System.out.println(index);
    }
}
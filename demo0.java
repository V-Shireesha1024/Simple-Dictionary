import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo0 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> dictionary = new HashMap<>();

        // Adding some default words
        String[][] words = {
        	    {"ability", "The power or skill to do something."},
        	    {"accept", "To agree to receive or take something."},
        	    {"access", "The ability to enter or use something."},
        	    {"account", "A record of money or information."},
        	    {"achieve", "To successfully complete something."},
        	    {"action", "Something that is done."},
        	    {"active", "Doing something or being involved."},
        	    {"activity", "Something that a person does."},
        	    {"actual", "Real or existing in fact."},
        	    {"adapt", "To change to suit a new situation."},
        	    {"add", "To put something together with another thing."},
        	    {"address", "Details showing where someone or something is located."},
        	    {"advice", "A suggestion about what someone should do."},
        	    {"affect", "To cause a change in something."},
        	    {"agree", "To have the same opinion."},
        	    {"allow", "To give permission."},
        	    {"answer", "A response to a question."},
        	    {"appear", "To become visible or seem to be present."},
        	    {"apply", "To request or use something."},
        	    {"approach", "A way of dealing with something."},
        	    {"area", "A particular place or region."},
        	    {"arrange", "To organize something in a particular way."},
        	    {"arrive", "To reach a place."},
        	    {"article", "A piece of writing about a subject."},
        	    {"assist", "To help someone."},
        	    {"attempt", "An effort to do something."},
        	    {"attention", "Careful thought or notice given to something."},
        	    {"avoid", "To keep away from something."},
        	    {"basic", "Simple and important."},
        	    {"beautiful", "Very attractive or pleasing."},
        	    {"begin", "To start something."},
        	    {"believe", "To accept something as true."},
        	    {"benefit", "An advantage or helpful result."},
        	    {"better", "Of higher quality."},
        	    {"build", "To make or construct something."},
        	    {"business", "An organization that sells goods or services."},
        	    {"calculate", "To find an answer using mathematics."},
        	    {"career", "A person's working life or profession."},
        	    {"careful", "Giving attention to avoid mistakes."},
        	    {"change", "To make something different."},
        	    {"choose", "To select something."},
        	    {"clear", "Easy to understand."},
        	    {"close", "To shut something."},
        	    {"collect", "To gather things together."},
        	    {"complete", "Having all necessary parts."},
        	    {"computer", "An electronic device used to process data."},
        	    {"connect", "To join two or more things."},
        	    {"consider", "To think carefully about something."},
        	    {"create", "To make something new."},
        	    {"data", "Information collected for use or analysis."},
        	    {"decide", "To choose after thinking."},
        	    {"develop", "To grow or create something."},
        	    {"difference", "A way in which things are not the same."},
        	    {"difficult", "Not easy to do or understand."},
        	    {"digital", "Using electronic technology."},
        	    {"discover", "To find something for the first time."},
        	    {"discuss", "To talk about something."},
        	    {"display", "To show something."},
        	    {"document", "A written or electronic record."},
        	    {"education", "The process of learning."},
        	    {"effect", "A result produced by something."},
        	    {"efficient", "Working well without wasting time or resources."},
        	    {"effort", "An attempt to do something."},
        	    {"employee", "A person who works for an organization."},
        	    {"enable", "To make something possible."},
        	    {"encourage", "To give someone support or confidence."},
        	    {"energy", "The ability to do work."},
        	    {"environment", "The surroundings in which something exists."},
        	    {"example", "Something that shows what another thing is like."},
        	    {"experience", "Knowledge gained through doing something."},
        	    {"explain", "To make something clear or understandable."},
        	    {"feature", "An important part or quality of something."},
        	    {"focus", "To give attention to something."},
        	    {"function", "A purpose or activity of something."},
        	    {"future", "The time that has not happened yet."},
        	    {"goal", "Something a person wants to achieve."},
        	    {"growth", "The process of becoming larger or better."},
        	    {"help", "To make something easier for someone."},
        	    {"important", "Having great value or meaning."},
        	    {"improve", "To make something better."},
        	    {"include", "To contain something as part of a whole."},
        	    {"information", "Facts or knowledge about something."},
        	    {"input", "Information entered into a system."},
        	    {"install", "To put software or equipment into use."},
        	    {"interest", "A feeling of wanting to know more."},
        	    {"internet", "A worldwide network connecting computers."},
        	    {"knowledge", "Information and understanding gained through learning."},
        	    {"language", "A system used for communication."},
        	    {"learn", "To gain knowledge or skill."},
        	    {"machine", "A device that performs a task."},
        	    {"manage", "To control or organize something."},
        	    {"method", "A particular way of doing something."},
        	    {"model", "A representation of something."},
        	    {"network", "A group of connected computers or systems."},
        	    {"object", "A thing that can be seen or touched."},
        	    {"operate", "To control or use something."},
        	    {"option", "A choice that can be selected."},
        	    {"output", "Information produced by a system."},
        	    {"password", "A secret word used for access."},
        	    {"performance", "How well something works."},
        	    {"program", "A set of instructions for a computer."},
        	    {"project", "A planned piece of work."},
        	    {"process", "A series of actions to achieve a result."},
        	    {"problem", "Something that needs to be solved."},
        	    {"produce", "To make or create something."},
        	    {"provide", "To give something that is needed."},
        	    {"purpose", "The reason something exists or is done."},
        	    {"quality", "How good or bad something is."},
        	    {"question", "Something asked to get information."},
        	    {"quick", "Moving or happening fast."},
        	    {"read", "To look at and understand written words."},
        	    {"result", "Something that happens because of an action."},
        	    {"return", "To come or go back."},
        	    {"search", "To look for something."},
        	    {"secure", "Protected from danger or unauthorized access."},
        	    {"select", "To choose something."},
        	    {"simple", "Easy to understand or do."},
        	    {"skill", "The ability to do something well."},
        	    {"software", "Programs used by a computer."},
        	    {"solution", "An answer to a problem."},
        	    {"source", "A place or thing from which something comes."},
        	    {"start", "To begin something."},
        	    {"student", "A person who is learning."},
        	    {"success", "Achievement of a desired result."},
        	    {"support", "Help given to someone or something."},
        	    {"system", "A group of connected parts working together."},
        	    {"technology", "The use of scientific knowledge for practical purposes."},
        	    {"test", "An examination used to check knowledge or performance."},
        	    {"tool", "Something used to perform a task."},
        	    {"understand", "To know the meaning of something."},
        	    {"update", "To make something more current."},
        	    {"user", "A person who uses something."},
        	    {"value", "The importance or worth of something."},
        	    {"website", "A collection of web pages on the internet."},
        	    {"work", "An activity involving effort."},
        	    {"write", "To form words using letters."},
        	    {"java", "A programming language used to develop applications."},
        	    {"python", "A popular programming language."},
        	    {"database", "An organized collection of information."},
        	    {"algorithm", "A step-by-step procedure for solving a problem."},
        	    {"array", "A collection of elements stored together."},
        	    {"class", "A blueprint used to create objects in programming."},
        	    {"variable", "A named storage location for a value."},
        	    {"loop", "A structure used to repeat instructions."},
        	    {"string", "A sequence of characters."},
        	    {"integer", "A whole number without a decimal part."},
        	    {"boolean", "A data type with true or false values."},
        	    {"compiler", "A program that converts source code into machine code."},
        	    {"debug", "To find and fix errors in a program."},
        	    {"error", "A mistake or problem in a program."},
        	    {"execute", "To run a program or instruction."},
        	    {"interface", "A way through which users interact with a system."},
        	    {"object", "An instance created from a class."},
        	    {"package", "A group of related classes and interfaces."},
        	    {"inheritance", "A feature where one class gets properties from another."},
        	    {"polymorphism", "The ability of one interface to have different forms."},
        	    {"encapsulation", "Combining data and methods into one unit."},
        	    {"abstraction", "Showing important details while hiding unnecessary ones."}
        	};

        	for (String[] word : words) {
        	    dictionary.put(word[0], word[1]);
        	}
        while (true) {

            System.out.println("\n===== SIMPLE DICTIONARY =====");
            System.out.println("1. Search Word");
            System.out.println("2. Add Word");
            System.out.println("3. Update Meaning");
            System.out.println("4. Delete Word");
            System.out.println("5. Display All Words");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter word to search: ");
                String word = sc.nextLine().toLowerCase();

                if (dictionary.containsKey(word)) {
                    System.out.println("Meaning: " + dictionary.get(word));
                } else {
                    System.out.println("Word not found.");
                }

            } else if (choice == 2) {

                System.out.print("Enter word: ");
                String word = sc.nextLine().toLowerCase();

                System.out.print("Enter meaning: ");
                String meaning = sc.nextLine();

                dictionary.put(word, meaning);

                System.out.println("Word added successfully.");

            } else if (choice == 3) {

                System.out.print("Enter word to update: ");
                String word = sc.nextLine().toLowerCase();

                if (dictionary.containsKey(word)) {

                    System.out.print("Enter new meaning: ");
                    String meaning = sc.nextLine();

                    dictionary.put(word, meaning);

                    System.out.println("Meaning updated successfully.");

                } else {
                    System.out.println("Word not found.");
                }

            } else if (choice == 4) {

                System.out.print("Enter word to delete: ");
                String word = sc.nextLine().toLowerCase();

                if (dictionary.containsKey(word)) {

                    dictionary.remove(word);

                    System.out.println("Word deleted successfully.");

                } else {
                    System.out.println("Word not found.");
                }

            } else if (choice == 5) {

                System.out.println("\n--- All Words ---");

                if (dictionary.isEmpty()) {
                    System.out.println("Dictionary is empty.");
                } else {

                    for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }

            } else if (choice == 6) {

                System.out.println("Thank you for using Simple Dictionary.");
                break;

            } else {

                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
package org.wecancoeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.Model.Category;
import org.wecancoeit.reviews.Model.Destination;
import org.wecancoeit.reviews.Repos.CategoryRepository;
import org.wecancoeit.reviews.Repos.DestinationRepository;
import org.wecancoeit.reviews.Repos.ReviewRepository;

@Component
public class Populator implements CommandLineRunner {
    private ReviewRepository reviewRepo;
    private DestinationRepository destinationRepo;
    private CategoryRepository categoryRepo;

    public Populator(ReviewRepository reviewRepo, DestinationRepository destinationRepo, CategoryRepository categoryRepo) {
        this.reviewRepo = reviewRepo;
        this.destinationRepo = destinationRepo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Category beaches = new Category("Beaches");
        categoryRepo.save(beaches);
        Category mountains = new Category("Mountains");
        categoryRepo.save(mountains);
        Category cities = new Category("Cities");
        categoryRepo.save(cities);
        Category international = new Category("International");
        categoryRepo.save(international);
        Category cruise = new Category("Cruise");
        categoryRepo.save(cruise);

        Destination tulum = new Destination("Tulum, Mexico", "Located on the Caribbean coastline of Mexico, Tulum boasts exquisite beaches and well-maintained ruins of an ancient Mayan port city.");
        destinationRepo.save(tulum);
        Destination destin = new Destination("Destin, Florida", "Destin is located in the Florida Panhandle and is known for its white sandy beaches and beautiful clear blue turquoise water.");
        destinationRepo.save(destin);
        Destination myrtleBeach = new Destination("Myrtle Beach, South Carolina", "Part of the ‘Grand Strand’, Myrtle Beach is the hub of a 60-mile string of beaches. It boasts designer golf courses and plenty of family-friendly amenities.");
        destinationRepo.save(myrtleBeach);

        Destination gatlinburg = new Destination("Gatlinburg, Tennessee", "Also known as the “gateway” to the Great Smoky Mountains National Park, Gatlinburg has endless activities including taking in the sights at Space Needle observation tower, or enjoying a fun day at the Dollywood amusement park.");
        destinationRepo.save(gatlinburg);
        Destination tetons = new Destination("Teton Range, Wyoming", "The Teton Range, located on the border of Wyoming and Idaho is known for its jagged peaks and breathtaking views.");
        destinationRepo.save(tetons);
        Destination whiteMountains = new Destination("White Mountains, New Hampshire", "The White Mountains are a year-round destination filled with national and state parks that provide ample opportunities for skiing and hiking.");
        destinationRepo.save(whiteMountains);

        Destination newYork = new Destination("New York, New York", "Densely populated and among the world's major commercial, cultural centers and financial centers. More than 800 languages are spoken, making it the most linguistically diverse city in the United States.");
        destinationRepo.save(newYork);
        Destination chicago = new Destination("Chicago, Illinois", "Among the largest cities in the U.S, Chicago has its very own culture. Its skyline is punctuated by skyscrapers such as the iconic John Hancock Center, 1.451-ft Willis Tower. The city is renowned for its museums, including the art institute of Chicago.");
        destinationRepo.save(chicago);
        Destination miami = new Destination("Miami, Florida", "Miami is a metropolis located in Miami-Dade county in southeastern Florida. The metro area is by far the largest urban economy in Florida and is the second largest city in the U.S and third richest globally in purchasing power.");
        destinationRepo.save(miami);

        Destination paris = new Destination("Paris, France", "Also known as the Latin Quarter, Paris is home to the Sorbonne university and vibrant cafes. The Eiffel Tower is a must see in addition to the famed Shakespeare & Company bookshop.");
        destinationRepo.save(paris);
        Destination athens = new Destination("Athens, Greece", "As the capital of Greece, Athens has been historically the heart of ancient Greece. Travelers and tourists flock to see the breathtaking Acropolis and the hilltop citadel topped with the Parthenon Temple.");
        destinationRepo.save(athens);
        Destination phnomPenh = new Destination("Phnom Penh, Cambodia", "Phnom Penh is the capital of this quickly reemerging country. It is home to the famous Tuel Sleng museum as well as countless nightlife, bars, restaurants and the impressive Central Market.");
        destinationRepo.save(phnomPenh);

        Destination disney = new Destination("Disney Cruise Line", "Disney cruise lines provides entertainment for the whole family!");
        destinationRepo.save(disney);
        Destination carnival = new Destination("Carnival Cruise Line", "Carnival Cruise lines are non-stop fun on your way to beautiful sunny destinations.");
        destinationRepo.save(carnival);
        Destination royalCaribbean = new Destination("Royal Caribbean Cruise Line", "Royal Caribbean has something for everyone with top-rated itineraries and destinations around the world.");
        destinationRepo.save(royalCaribbean);

    }
}
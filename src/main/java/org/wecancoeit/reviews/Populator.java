package org.wecancoeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.Model.Category;
import org.wecancoeit.reviews.Model.Destination;
import org.wecancoeit.reviews.Model.Hashtag;
import org.wecancoeit.reviews.Model.Review;
import org.wecancoeit.reviews.Repos.CategoryRepository;
import org.wecancoeit.reviews.Repos.DestinationRepository;
import org.wecancoeit.reviews.Repos.HashtagRepository;
import org.wecancoeit.reviews.Repos.ReviewRepository;

@Component
public class Populator implements CommandLineRunner {
    private ReviewRepository reviewRepo;
    private DestinationRepository destinationRepo;
    private CategoryRepository categoryRepo;
    private HashtagRepository hashtagRepo;

    public Populator(ReviewRepository reviewRepo, DestinationRepository destinationRepo, CategoryRepository categoryRepo, HashtagRepository hashtagRepo) {
        this.reviewRepo = reviewRepo;
        this.destinationRepo = destinationRepo;
        this.categoryRepo = categoryRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Category beaches = new Category("Beaches","/Images/sean-oulashin-KMn4VEeEPR8-unsplash.jpg", "beach image");
        categoryRepo.save(beaches);
        Category mountains = new Category("Mountains", "/images/kalen-emsley-Bkci_8qcdvQ-unsplash.jpg", "mountains" );
        categoryRepo.save(mountains);
        Category cities = new Category("Cities", "/images/pedro-lastra-Nyvq2juw4_o-unsplash.jpg", "city skyline");
        categoryRepo.save(cities);
        Category international = new Category("International","/images/sean-oulashin-KMn4VEeEPR8-unsplash.jpg","Paris");
        categoryRepo.save(international);
        Category cruise = new Category("Cruise", "/images/josiah-weiss-tthKs4A7XMY-unsplash.jpg", "cruise ship");
        categoryRepo.save(cruise);

        Hashtag familyFriendly = new Hashtag("FamilyFriendly");
        hashtagRepo.save(familyFriendly);
        Hashtag breathtaking = new Hashtag("Breathtaking");
        hashtagRepo.save(breathtaking);
        Hashtag goodFood = new Hashtag("GoodFood");
        hashtagRepo.save(goodFood);
        Hashtag allInclusive = new Hashtag("AllInclusive");
        hashtagRepo.save(allInclusive);
        Hashtag nightLife = new Hashtag("NightLife");
        hashtagRepo.save(nightLife);
        Hashtag amazing = new Hashtag("Amazing");
        hashtagRepo.save(amazing);
        Hashtag relaxing = new Hashtag("Relaxing");
        hashtagRepo.save(relaxing);
        Hashtag adventurous = new Hashtag("Adventurous");
        hashtagRepo.save(adventurous);
        Hashtag transportation = new Hashtag("Transportation");
        hashtagRepo.save(transportation);

        Review reviewTulum = new Review("Tulum", 5, "⭐", "Tulum is an incredible place! Can't wait to visit again!" );
        reviewRepo.save(reviewTulum);
        Review reviewDestin = new Review("Destin,Florida",5, "⭐","The beach is busy but the white sand is beautiful!");
        reviewRepo.save(reviewDestin);
        Review reviewMyrtle = new Review("Myrtle Beach, South Carolina", 4, "⭐","Lots of things for kids to do.");
        reviewRepo.save(reviewMyrtle);
        Review reviewGatlinburg = new Review("Gatlinburg, Tennessee", 4, "⭐", "Fun adventure for everyone in the family.");
        reviewRepo.save(reviewGatlinburg);
        Review reviewTeton = new Review("Teton Range", 5, "⭐", "Stunning views in every direction!");
        reviewRepo.save(reviewTeton);
        Review reviewWhiteMtns = new Review("White Mountains, New Hampshire", 4, "⭐", "Scenic and peaceful.");
        reviewRepo.save(reviewWhiteMtns);
        Review reviewNY = new Review("New York City, NY", 4, "⭐","Great experience, lots of good food and easy transportation.");
        reviewRepo.save(reviewNY);
        Review reviewChicago = new Review("Chicago, IL", 5, "⭐","Great city experience - river boat tour was awesome.");
        reviewRepo.save(reviewChicago);
        Review reviewMiami = new Review("Miami, FL", 3,"⭐", "If you like exciting night life, this is the place for you.");
        reviewRepo.save(reviewMiami);
        Review reviewParis = new Review("Paris, France", 5, "⭐", "Make sure you visit the Louvre and Versailles gardens.");
        reviewRepo.save(reviewParis);
        Review reviewAthens = new Review("Athens, Greece", 4, "⭐","Gorgeous city with lots of amazing history!");
        reviewRepo.save(reviewAthens);
        Review reviewPhnom = new Review("Phnom Penh",4, "⭐","Lots of rich history with a beautiful landscape. Lovely people.");
        reviewRepo.save(reviewPhnom);
        Review reviewDisney = new Review("Disney Cruise Line", 4, "⭐","Great trip for the family.");
        reviewRepo.save(reviewDisney);
        Review reviewCarnival = new Review("Carnival Cruise", 3, "⭐", "The food was excellent.");
        reviewRepo.save(reviewCarnival);
        Review reviewRoyal = new Review("Royal Caribbean Cruise Line", 5, "⭐","Excellent vacation. Probably better without kids.");
        reviewRepo.save(reviewRoyal);

        Category[] tulumCategories = {beaches,international};
        Hashtag[] tulumHashtags = {adventurous, goodFood, relaxing};
        Destination tulum = new Destination("Tulum, Mexico", "/images/tulum.jpeg", "tulum ruins", "Located on the Caribbean coastline of Mexico, Tulum boasts exquisite beaches and well-maintained ruins of an ancient Mayan port city.", tulumCategories, tulumHashtags, reviewTulum);
        destinationRepo.save(tulum);
        Category[] destinCategories = {beaches};
        Hashtag[] destinHashtags = {adventurous, goodFood, familyFriendly};
        Destination destin = new Destination("Destin, Florida", "/images/destin_Florida.jpeg", "destin beach", "Destin is located in the Florida Panhandle and is known for its white sandy beaches and beautiful clear blue turquoise water.", destinCategories,destinHashtags, reviewDestin);
        destinationRepo.save(destin);
        Category[] myrtleCategories = {beaches};
        Hashtag[] myrtleHashtags = {adventurous, goodFood, familyFriendly, amazing};
        Destination myrtleBeach = new Destination("Myrtle Beach, South Carolina", "/images/myrtle.jpeg","myrtle beach", "Part of the ‘Grand Strand’, Myrtle Beach is the hub of a 60-mile string of beaches. It boasts designer golf courses and plenty of family-friendly amenities.", myrtleCategories, myrtleHashtags, reviewMyrtle);
        destinationRepo.save(myrtleBeach);
        Category[] gatlinburgCategories = {mountains};
        Hashtag[] gatlinburgHashtags = {adventurous, familyFriendly, breathtaking};
        Destination gatlinburg = new Destination("Gatlinburg, Tennessee", "/images/gatlinburg.jpeg", "gatlinburg", "Also known as the “gateway” to the Great Smoky Mountains National Park, Gatlinburg has endless activities including taking in the sights at Space Needle observation tower, or enjoying a fun day at the Dollywood amusement park.", gatlinburgCategories,gatlinburgHashtags, reviewGatlinburg);
        destinationRepo.save(gatlinburg);
        Category[] tetonCategories = {mountains};
        Hashtag[] tetonHashtags = {adventurous, goodFood, relaxing, breathtaking};
        Destination tetons = new Destination("Teton Range, Wyoming", "/images/teton.jpeg","teton range", "The Teton Range, located on the border of Wyoming and Idaho is known for its jagged peaks and breathtaking views.", tetonCategories, tetonHashtags, reviewTeton);
        destinationRepo.save(tetons);
        Category[] whiteMtnCategories = {mountains};
        Hashtag[] whiteMtnHashtags = {adventurous, familyFriendly, relaxing, breathtaking};
        Destination whiteMountains = new Destination("White Mountains, New Hampshire", "/images/whitemtns.jpeg","white mountains", "The White Mountains are a year-round destination filled with national and state parks that provide ample opportunities for skiing and hiking.", whiteMtnCategories, whiteMtnHashtags, reviewWhiteMtns);
        destinationRepo.save(whiteMountains);
        Category[] newYorkCategories = {cities};
        Hashtag[] newYorkHashtags = {adventurous, goodFood, amazing, transportation, nightLife};
        Destination newYork = new Destination("New York, New York", "/images/new york city pic.jpg","New york City","Densely populated and among the world's major commercial, cultural centers and financial centers. More than 800 languages are spoken, making it the most linguistically diverse city in the United States.", newYorkCategories, newYorkHashtags, reviewNY);
        destinationRepo.save(newYork);
        Category[] chicagoCategories = {cities};
        Hashtag[] chicagoHashtags = {transportation, goodFood, familyFriendly, amazing, nightLife};
        Destination chicago = new Destination("Chicago, Illinois", "/images/chicago.jpg","chicago bean", "Among the largest cities in the U.S, Chicago has its very own culture. Its skyline is punctuated by skyscrapers such as the iconic John Hancock Center, 1.451-ft Willis Tower. The city is renowned for its museums, including the art institute of Chicago.", chicagoCategories, chicagoHashtags, reviewChicago);
        destinationRepo.save(chicago);
        Category[] miamiCategories = {beaches,cities};
        Hashtag[] miamiHashtags = {adventurous, goodFood, relaxing, nightLife};
        Destination miami = new Destination("Miami, Florida", "/images/miami (1).jpg", "miami beach", "Miami is a metropolis located in Miami-Dade county in southeastern Florida. The metro area is by far the largest urban economy in Florida and is the second largest city in the U.S and third richest globally in purchasing power.", miamiCategories, miamiHashtags, reviewMiami);
        destinationRepo.save(miami);
        Category[] parisCategories = {cities,international};
        Hashtag[] parisHashtags = {breathtaking, goodFood, relaxing, nightLife, transportation};
        Destination paris = new Destination("Paris, France", "/images/Eiffel-Tower_GettyImages-1060266626 copy.jpg","Eiffel Tower","Also known as the Latin Quarter, Paris is home to the Sorbonne university and vibrant cafes. The Eiffel Tower is a must see in addition to the famed Shakespeare & Company bookshop.", parisCategories, parisHashtags, reviewParis);
        destinationRepo.save(paris);
        Category[] athensCategories = {cities,international};
        Hashtag[] athensHashtags = {adventurous, goodFood, relaxing, breathtaking};
        Destination athens = new Destination("Athens, Greece", "/images/athens.jpg","athens", "As the capital of Greece, Athens has been historically the heart of ancient Greece. Travelers and tourists flock to see the breathtaking Acropolis and the hilltop citadel topped with the Parthenon Temple.", athensCategories, athensHashtags, reviewAthens);
        destinationRepo.save(athens);
        Category[] phnomCategories = {international};
        Hashtag[] phnomHashtags = {adventurous, goodFood, amazing};
        Destination phnomPenh = new Destination("Phnom Penh, Cambodia","/images/pnhom_penh.jpeg","pnhom penh", "Phnom Penh is the capital of this quickly reemerging country. It is home to the famous Tuel Sleng museum as well as countless nightlife, bars, restaurants and the impressive Central Market.", phnomCategories, phnomHashtags, reviewPhnom);
        destinationRepo.save(phnomPenh);
        Category[] disneyCategories = {beaches,cruise};
        Hashtag[] disneyHashtags = {adventurous, goodFood, allInclusive};
        Destination disney = new Destination("Disney Cruise Line", "/images/DCL-Disney-Wish-Rendering.jpeg","Disney Cruise Ship","Disney cruise lines provides entertainment for the whole family!", disneyCategories, disneyHashtags, reviewDisney);
        destinationRepo.save(disney);
        Category[] carnivalCategories = {beaches,cruise};
        Hashtag[] carnivalHashtags = {adventurous, goodFood, familyFriendly, allInclusive};
        Destination carnival = new Destination("Carnival Cruise Line", "/images/Carnival-cruise-line-military-cruise-deals-discount-4.jpeg","Carnival Cruise Ship", "Carnival Cruise lines are non-stop fun on your way to beautiful sunny destinations.", carnivalCategories, carnivalHashtags, reviewCarnival);
        destinationRepo.save(carnival);
        Category[] royalCategories = {beaches,cruise};
        Hashtag[] royalHashtags = {allInclusive, goodFood, relaxing};
        Destination royalCaribbean = new Destination("Royal Caribbean Cruise Line","/images/royal.jpeg","Royal Caribbean Cruise Ship", "Royal Caribbean has something for everyone with top-rated itineraries and destinations around the world.", royalCategories, royalHashtags, reviewRoyal);
        destinationRepo.save(royalCaribbean);


    }
}

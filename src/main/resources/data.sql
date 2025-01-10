Insert into SERVICES_DETAILS(N_SERVICE_ID, V_DESCRIPTION, V_TITLE, N_PRICE, V_IMAGE_ID) 
values (1, 'Browse our curated collection of pet essentials and 
pamper your furry companions with the best products in town!', 'Dog Boarding', 1299, 'boarding');

Insert into SERVICES_DETAILS(N_SERVICE_ID, V_DESCRIPTION, V_TITLE, N_PRICE, V_IMAGE_ID) 
values (2, 'Indulge your pets in a luxurious boarding experience with 
spacious accommodations and personalized care tailored to their needs.', 'Grooming', 999, 'grooming');

Insert into SERVICES_DETAILS(N_SERVICE_ID, V_DESCRIPTION, V_TITLE, N_PRICE, V_IMAGE_ID) 
values (3, 'From routine check-ups to emergency care, our expert veterinarians ensure
 that your pets receive top-notch medical attention and love.', 'Daycare', 1199, 'daycare');

Insert into SERVICES_DETAILS(N_SERVICE_ID, V_DESCRIPTION, V_TITLE, N_PRICE, V_IMAGE_ID) 
values (4, 'Let your pets socialize and have a blast in our interactive play areas
 designed to keep them active, engaged, and happy!', 'Swimming', 599, 'swimming');



Insert into TESTINOMIALS (N_TESTINOMIALS_ID , V_NAME, V_EXPERIENCE, V_IMAGE_ID) 
values (1, 'Maxwell P.', 'Paws down, the best pet care service I''ve ever used! My doggo is always excited to visit Paws & Claws Haven.', 'userId_m1');


Insert into TESTINOMIALS (N_TESTINOMIALS_ID , V_NAME, V_EXPERIENCE, V_IMAGE_ID) 
values (2, 'Olivia S.', 'My cat''s purrs speak volumes about the exceptional care received here. Paws & Claws Haven is the real deal!', 'userId_f1');

Insert into TESTINOMIALS (N_TESTINOMIALS_ID , V_NAME, V_EXPERIENCE, V_IMAGE_ID) 
values (3, 'Buddy L.', 'From vet services to dog boarding, this place is a pet paradise! My furry friends are in love with Paws & Claws Haven.', 'userId_m2');

Insert into TESTINOMIALS (N_TESTINOMIALS_ID , V_NAME, V_EXPERIENCE, V_IMAGE_ID) 
values (4, 'Luna M.', 'Pawsitively amazing! The online store has everything a pet parent could dream of. Paws & Claws Haven is a game-changer!', 'userId_f2');

Insert into TESTINOMIALS (N_TESTINOMIALS_ID , V_NAME, V_EXPERIENCE, V_IMAGE_ID) 
values (5, 'Rocky T.', 'Pawsitively amazing! The online store has everything a pet parent could dream of. Paws & Claws Haven is a game-changer!', 'userId_m3');

Insert into TESTINOMIALS (N_TESTINOMIALS_ID , V_NAME, V_EXPERIENCE, V_IMAGE_ID) 
values (6, 'Bella R.', 'Paws & Claws Haven is the pawfect place for all your pet needs. Trust me, your furry companions will thank you for choosing this gem!', 'userId_f3');


insert into USERS (N_USER_ID, V_NAME, V_EMAIL_ID, V_PASSWORD) VALUES (1, 'TEST', 'TEST@gmail.com', 'Password');
insert into USER_HASH_MAP (N_HASH_MAP_ID, N_USER_ID, V_USER_HASH_CODE) values (1243, 1, '1234_65672822');

commit;
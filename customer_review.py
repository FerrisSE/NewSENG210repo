def pizzeria_review(stars, fav_part):

    if stars == 5:
        comment = "WOAH! That crust is super tasty!"
    else:
        comment = "PHEW! Cheese made the whole pack soggy!"

    print(f"Pizzeria says: {comment}")
    print(f"Saved customer feedback: 'The customer loved the {fav_part}!'")

pizzeria_review(starts=5, fav_part="Crispy Crust")
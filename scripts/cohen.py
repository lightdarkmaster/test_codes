from sklearn.metrics import cohen_kappa_score

# Example ratings
rater1 = [4, 4, 4, 4, 4, 4, 4, 4, 4]
rater2 = [4, 4, 4, 4, 4, 4, 4, 4, 4]
rater3 = [4, 4, 4, 4, 4, 4, 4, 4, 3]

# Function to check if all ratings are identical
def check_uniformity(*raters):
    for rater in raters:
        if len(set(rater)) > 1:  # If there's more than one unique value
            return False
    return True

# Function to compute observed agreement
def calculate_observed_agreement(rater1, rater2):
    agreements = sum(1 for a, b in zip(rater1, rater2) if a == b)
    return agreements / len(rater1)

# Check for uniformity across raters
if check_uniformity(rater1, rater2, rater3):
    print("Cohen's Kappa is undefined due to perfect agreement.")
else:
    # Compute Cohen's Kappa for rater1 and rater2
    kappa12 = cohen_kappa_score(rater1, rater2)
    print("Cohen's Kappa (Rater 1 & Rater 2):", kappa12)
    
    # Compute Cohen's Kappa for rater1 and rater3
    kappa13 = cohen_kappa_score(rater1, rater3)
    print("Cohen's Kappa (Rater 1 & Rater 3):", kappa13)
    
    # Compute observed agreement
    observed_agreement_12 = calculate_observed_agreement(rater1, rater2)
    print("Observed Agreement (Rater 1 & Rater 2):", observed_agreement_12)
    
    observed_agreement_13 = calculate_observed_agreement(rater1, rater3)
    print("Observed Agreement (Rater 1 & Rater 3):", observed_agreement_13)

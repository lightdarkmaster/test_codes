import numpy as np
from statsmodels.stats.inter_rater import fleiss_kappa

# Example: Rating data (rows are subjects, columns are categories, values are counts)
ratings = np.array([
    [0, 0, 0, 4],  # Subject 1: 0 in category 1, 0 in category 2, 1 in category 3, 0 in category 0
    [0, 0, 0, 4],  # Subject 2
    [0, 0, 0, 4],  # Subject 3
])

# Compute Fleiss' Kappa
kappa = fleiss_kappa(ratings, method='fleiss')
print(f"Fleiss' Kappa: {kappa}")

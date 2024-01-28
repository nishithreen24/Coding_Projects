import math

# Calculates the distance from the goal line to the shot location
def calc_distance_from_goal(shot_x, shot_y):
  # The pitch dimensions and the location of the goal can be hardcoded or passed as arguments
  pitch_width = 105  # meters
  pitch_length = 68  # meters
  goal_x = pitch_width / 2
  goal_y = 0  # The goal is located at the bottom edge of the pitch
  
  # Calculate the Euclidean distance between the shot location and the goal
  distance = math.sqrt((goal_x - shot_x) ** 2 + (goal_y - shot_y) ** 2)
  return distance

# Calculates the xG value based on the distance from the goal
def calc_xG_from_distance(distance):
  # This function can be implemented in various ways
  # Here is a simple example that uses a linear model
  xG = 1 - (distance / 105)  # The pitch width is used as the maximum distance
  return xG

# Calculates the xG value based on the type of assist
def calc_xG_from_assist_type(assist_type):
  if assist_type == "pass":
    xG = 0.1
  elif assist_type == "rebound":
    xG = 0.05
  else:
    # Other types of assists have a lower xG value
    xG = 0.01
  return xG

# Calculates the xG value based on the type of shot
def calc_xG_from_shot_type(shot_type):
  if shot_type == "foot":
    xG = 0.1
  elif shot_type == "head":
    xG = 0.06
  else:
    # Other types of shots have a lower xG value
    xG = 0.03
  return xG
def expected_goals(shot_x, shot_y, assist_type, shot_type):
  # Initialize the xG value to 0
  xG = 0
  
  # Calculate the xG based on the location of the shot
  distance_from_goal = calc_distance_from_goal(shot_x, shot_y)
  distance_weight = 0.5  # Adjust this weight based on the data or expert knowledge
  xG += distance_weight * calc_xG_from_distance(distance_from_goal)
  
  # Calculate the xG based on the type of assist
  assist_weight = 0.3  # Adjust this weight based on the data or expert knowledge
  xG += assist_weight * calc_xG_from_assist_type(assist_type)
  
  # Calculate the xG based on the type of shot
  shot_type_weight = 0.2  # Adjust this weight based on the data or expert knowledge
  xG += shot_type_weight * calc_xG_from_shot_type(shot_type)
  
  return xG
print(expected_goals(1, 35, "pass", "foot"))
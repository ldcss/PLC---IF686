data Command = Forward Int | Backward Int | TurnLeft | TurnRight 
               deriving (Eq, Show, Read)

data Direction = North | South | West | East
                 deriving (Read, Show)

turnByDirection :: Direction -> Command -> Direction
turnByDirection North TurnLeft = West
turnByDirection North TurnRight = East
turnByDirection South TurnLeft = East
turnByDirection South TurnRight = West
turnByDirection West TurnLeft = South
turnByDirection West TurnRight = North
turnByDirection East TurnLeft = North
turnByDirection East TurnRight = South

faces :: Direction -> [Command] -> Direction
faces d [] = d
faces d (a:as) = faces (turnByDirection d a) as
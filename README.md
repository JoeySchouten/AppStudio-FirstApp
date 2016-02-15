Joey Schouten <e-mail known>

DiceRoller 3.0 - This app generates a random number with bounds based on the button
pressed.

Added/fixed/etc.:<br>
- Refactored all snake_case to camelCase after feedback.<br>
- Cleaned up comments after feedback; now multi-line comments as per convention.</br>
- Fixed landscape layout for all activities; additive roller did not feature a dedicated landscape mode.<br>
- Added additive roller.<br>

Known issues/to-do/etc.:<br>
- Missing images for D8,10,12,100.<br>
- Rename main activity java file as well; gave errors after refactoring attempt.<br>
- Clean up code.<br>
- Edit additive roller to allow both addition and substraction of either integer values or dice results.<br>
- Add navigation bar for easier access.
- Remove spacing between buttons for a more calculator-esque feel, allowing for bigger buttons as well.

History:<br>
Ver. 2.0: <br>
- Created Dice.roll method to move dice roll code to.<br>
- Created Dice.boolDiceRoll for the rolling of dice for Shadowrun/Arkham Horror which only care whether you have a 5 or 6; displays amount of 5's and 6's rolled.<br>
- Added NumberPicker in order to roll more than one die at a time. Picker has been capped at 120.<br>
- Edited in-app help text to inform user of the use of the number picker.
- Renamed main activity XML file.

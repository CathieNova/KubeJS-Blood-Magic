
# This mod allows you to create recipes for Blood Magic using KubeJS.

# [For issues Join Discord](https://discord.gg/u6SpUpfMzy)

## Supported recipe types:
### **Blood Altar**
- event.recipes.bloodmagic.altar(output, input)
- event.recipes.bloodmagic.altar(output, input).upgradeLevel(int)
- event.recipes.bloodmagic.altar(output, input).upgradeLevel(int).drainRate(int)
- event.recipes.bloodmagic.altar(output, input).upgradeLevel(int).drainRate(int).consumptionRate(int)
- event.recipes.bloodmagic.altar(output, input).upgradeLevel(int).drainRate(int).consumptionRate(int).altarSyphon(int)

### Arcane Ashes
- event.recipes.bloodmagic.array(output, baseInput, addedInput)
- event.recipes.bloodmagic.array(output, baseInput, addedInput).texture(string)
 
### Hellfire Forge
- event.recipes.bloodmagic.soulforge(output, [input])
- event.recipes.bloodmagic.soulforge(output, [input]).drain(double)
- event.recipes.bloodmagic.soulforge(output, [input]).minimumDrain(double).drain(double)

### Alchemical Reaction Chamber
- event.recipes.bloodmagic.arc(output, input, tool)
- event.recipes.bloodmagic.arc(output, input, tool).consumeIngredient(boolean)
> [!NOTE]
> (fluids and addedoutput are not supported)

### Alchemy Table
- event.recipes.bloodmagic.alchemytable(output, [input])
- event.recipes.bloodmagic.alchemytable(output, [input]).syphon(int)
- event.recipes.bloodmagic.alchemytable(output, [input]).syphon(int).ticks(int)
- event.recipes.bloodmagic.alchemytable(output, [input]).syphon(int).ticks(int).upgradeLevel(int)
 
### Example file: kubejs/server_scripts/bloodmagic.js:
```
ServerEvents.recipes(event => {
    event.recipes.bloodmagic.altar('minecraft:apple', 'minecraft:dirt')
    event.recipes.bloodmagic.altar('minecraft:iron_ingot', 'minecraft:coal').upgradeLevel(0).altarSyphon(2500)
 
    event.recipes.bloodmagic.alchemytable('minecraft:apple', ['minecraft:stick', 'minecraft:dirt'])
    event.recipes.bloodmagic.alchemytable('minecraft:stick', ['minecraft:oak_planks']).syphon(250).ticks(200)
 
    event.recipes.bloodmagic.array('minecraft:apple', 'minecraft:oak_sapling', 'minecraft:dirt')
   
    event.recipes.bloodmagic.arc('ars_nouveau:glyph_conjure_water', 'ars_nouveau:blank_glyph', 'minecraft:water_bucket', Fluid.of('minecraft:water', 100))
 
    event.recipes.bloodmagic.soulforge('minecraft:apple', ['minecraft:oak_sapling', 'minecraft:stick', 'minecraft:dirt']).drain(3.5)
})
```

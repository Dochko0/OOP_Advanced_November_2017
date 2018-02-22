package moduleContainerTests;

import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.Container;
import cresla.interfaces.EnergyModule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.NoSuchElementException;

public class ModuleContainerTests {

    private AbsorbingModule absorbingModuleMocked1;
    private AbsorbingModule absorbingModuleMocked2;
    private EnergyModule energyModuleMocked1;
    private EnergyModule energyModuleMocked2;
    private Container container;

    @Before
    public void before(){

        Mockito.mock(EnergyModule.class);
        this.container = new ModuleContainer(3);
        this.absorbingModuleMocked1 = Mockito.mock(AbsorbingModule.class);
        this.absorbingModuleMocked2 = Mockito.mock(AbsorbingModule.class);
        this.energyModuleMocked1 = Mockito.mock(EnergyModule.class);
        this.energyModuleMocked2 = Mockito.mock(EnergyModule.class);

        Mockito.when(absorbingModuleMocked1.getHeatAbsorbing()).thenReturn(2_000_000_000);
        Mockito.when(absorbingModuleMocked2.getHeatAbsorbing()).thenReturn(2_000_000_000);
        Mockito.when(energyModuleMocked1.getEnergyOutput()).thenReturn(2_000_000_000);
        Mockito.when(energyModuleMocked2.getEnergyOutput()).thenReturn(2_000_000_000);

        Mockito.when(absorbingModuleMocked1.getId()).thenReturn(1);
        Mockito.when(absorbingModuleMocked2.getId()).thenReturn(2);
        Mockito.when(energyModuleMocked1.getId()).thenReturn(3);
        Mockito.when(energyModuleMocked2.getId()).thenReturn(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEnergyModuleExeption(){
        this.container.addEnergyModule(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAbsorbingModuleExeption(){
        this.container.addAbsorbingModule(null);
    }

    @Test
    public void expectToRemoveModel(){
        this.container.addAbsorbingModule(this.absorbingModuleMocked1);
        this.container.addAbsorbingModule(this.absorbingModuleMocked2);
        this.container.addEnergyModule(this.energyModuleMocked1);
        this.container.addEnergyModule(this.energyModuleMocked2);

        Assert.assertEquals(this.container.getTotalEnergyOutput(), 4_000_000_000L);
        Assert.assertEquals(this.container.getTotalHeatAbsorbing(), 2_000_000_000L);
    }

    @Test
    public void absorbingModelWorksWithLong(){
        this.container.addAbsorbingModule(this.absorbingModuleMocked1);
        this.container.addAbsorbingModule(this.absorbingModuleMocked2);

        Assert.assertEquals(this.container.getTotalHeatAbsorbing(), 4_000_000_000L);
    }

    @Test
    public void emptyContainerReturnsZero(){
        Assert.assertEquals(this.container.getTotalHeatAbsorbing(), 0);
        Assert.assertEquals(this.container.getTotalEnergyOutput(), 0);
    }

    @Test
    public void borderCaseWithCapacity(){
        this.container.addAbsorbingModule(this.absorbingModuleMocked1);
        this.container.addAbsorbingModule(this.absorbingModuleMocked2);
        this.container.addEnergyModule(this.energyModuleMocked1);

        Assert.assertEquals(this.container.getTotalHeatAbsorbing(), 4000000000L);
        Assert.assertEquals(this.container.getTotalEnergyOutput(), 2000000000L);
    }

    @Test
    public void energyModelWorksWithLong(){
        this.container.addEnergyModule(this.energyModuleMocked1);
        this.container.addEnergyModule(this.energyModuleMocked2);
        Assert.assertEquals(this.container.getTotalEnergyOutput(), 4_000_000_000L);
    }

    @Test(expected = NoSuchElementException.class)
    public void expectToRemoveEnergy(){
       container=new ModuleContainer(0);
        this.container.addAbsorbingModule(this.absorbingModuleMocked1);
    }

}

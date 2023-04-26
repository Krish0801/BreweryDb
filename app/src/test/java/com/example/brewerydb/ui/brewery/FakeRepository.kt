import com.example.brewerydb.data.model.BreweryItem
import com.example.brewerydb.data.repository.Repository

class FakeRepository : Repository {

    private val fakeBreweryList = arrayListOf(
        BreweryItem("Brewery 1"),
        BreweryItem("Brewery 2"),
        BreweryItem("Brewery 3")
    )

    override suspend fun getBrewery(): List<BreweryItem> {
        return fakeBreweryList
    }


}

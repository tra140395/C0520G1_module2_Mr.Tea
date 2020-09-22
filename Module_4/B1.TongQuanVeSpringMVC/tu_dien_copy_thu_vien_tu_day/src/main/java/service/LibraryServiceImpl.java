package service;

import repository.LibraryRepository;
import repository.LibraryRepositoryImpl;

public class LibraryServiceImpl implements LibraryService{
    LibraryRepository libraryRepository = new LibraryRepositoryImpl();

    @Override
    public String findByKey(String key) {
        return libraryRepository.findByKey(key);
    }
}
